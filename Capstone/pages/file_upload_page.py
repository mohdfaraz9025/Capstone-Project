from selenium.webdriver.common.by import By

class FileUploadPage:
    def __init__(self, driver):
        self.driver = driver

    def get_header_text(self):
        return self.driver.find_element(By.TAG_NAME, "h3").text

    def choose_file(self, file_path):
        self.driver.find_element(By.ID, "file-upload").send_keys(file_path)

    def click_upload_button(self):
        self.driver.find_element(By.ID, "file-submit").click()
