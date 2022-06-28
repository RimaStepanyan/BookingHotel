package classwork.students.exception;

public class LessonNotFoundException extends Throwable {

    public LessonNotFoundException(String s) {

    }

    public class lessonNotFoundException extends Exception {

        public lessonNotFoundException() {
        }

        public lessonNotFoundException(String message) {
            super(message);
        }

        public lessonNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }

        public lessonNotFoundException(Throwable cause) {
            super(cause);
        }

        public lessonNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
