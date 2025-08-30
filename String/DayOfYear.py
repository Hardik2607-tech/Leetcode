def dayOfYear(date: str) -> int:
    year, month, day = map(int, date.split("-"))
    
    # Days in each month (non-leap year by default)
    days_in_month = [31, 28, 31, 30, 31, 30,
                     31, 31, 30, 31, 30, 31]
    
    # Leap year adjustment
    if (year % 400 == 0) or (year % 4 == 0 and year % 100 != 0):
        days_in_month[1] = 29
    
    # Sum days of previous months + current day
    return sum(days_in_month[:month-1]) + day


# Example usage:
print(dayOfYear("2019-01-09"))  # 9
print(dayOfYear("2019-02-10"))  # 41
print(dayOfYear("2020-03-01"))  # 61 (leap year)
