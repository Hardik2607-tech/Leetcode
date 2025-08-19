from datetime import datetime

def daysBetweenDates(date1: str, date2: str) -> int:
    d1 = datetime.strptime(date1, "%Y-%m-%d")
    d2 = datetime.strptime(date2, "%Y-%m-%d")
    return abs((d1 - d2).days)


# Example test cases
print(daysBetweenDates("2019-06-29", "2019-06-30"))  # Output: 1
print(daysBetweenDates("2020-01-15", "2019-12-31"))  # Output: 15
