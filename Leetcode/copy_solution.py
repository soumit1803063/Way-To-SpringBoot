import shutil
import os

def copy_folder(new_folder_name):
    basedir = os.path.dirname(os.path.abspath(__file__))
    source_folder = os.path.join(basedir, "Test")
    destination_folder = os.path.join(basedir, new_folder_name)

    try:
        # Remove the destination folder if it already exists
        if os.path.exists(destination_folder):
            shutil.rmtree(destination_folder)
            print(f"[INFO] Existing folder '{destination_folder}' has been removed.")

        # Copy the entire directory tree from source to destination
        shutil.copytree(source_folder, destination_folder)
        print(f"[SUCCESS] Folder copied successfully from '{source_folder}' to '{destination_folder}'.")

    except FileNotFoundError:
        print(f"[ERROR] The source folder '{source_folder}' does not exist.")
    except PermissionError:
        print(f"[ERROR] Permission denied. Unable to access '{destination_folder}'.")
    except Exception as e:
        print(f"[ERROR] An unexpected error occurred: {e}")

if __name__ == "__main__":
    problem_name = "209. Minimum Size Subarray Sum"
    new_folder_name = problem_name.strip()

    print(f"[INFO] Starting the folder copy process.")
    copy_folder(new_folder_name)
    print(f"[INFO] Folder copy process completed.")


