class Solution(object):
    def minimumEffortPath(self, heights: List[List[int]]) -> int:
        
        def isPath(effort: int) -> bool:
            seen, dq = {(0, 0)}, deque([(0, 0)])
            while dq:
                x, y = dq.popleft()
                if (x, y) == (len(heights) - 1, len(heights[0]) - 1):
                    return True
                for r, c in (x, y + 1), (x, y - 1), (x + 1, y), (x - 1, y):
                    if len(heights) > r >= 0 <= c < len(heights[0]) and abs(heights[r][c] - heights[x][y]) <= effort and (r, c) not in seen:
                        seen.add((r, c))
                        dq.append((r, c))
            return False            
        
        lo, hi = 0, 10 ** 6
        while lo < hi:
            effort = lo + hi >> 1
            if isPath(effort):
                hi = effort
            else:
                lo = effort + 1
        return lo