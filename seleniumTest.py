from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome('./chromedriver/chromedriver.exe')
driver.get("https://demoqa.com/buttons")
print(driver.title)
driver.find_element_by_xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button").click()
expected_sample_text = "You have done a dynamic click"
email_text_field = driver.find_element_by_xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/p")
actual_text = email_text_field.text
assert expected_sample_text == actual_text
if expected_sample_text == actual_text:
    print('הצלחנו!!!!!')
driver.close()
    


