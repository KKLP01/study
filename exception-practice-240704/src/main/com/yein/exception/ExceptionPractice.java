package main.com.yein.exception;

public class ExceptionPractice {

    /*
    * e.getMessage() : 생성자로 넘긴 메시지 리턴
    * */

    public static void main(String[] args) {

        int errorCode = 1;

        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new OverTimeException("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw  new SoldOutException("해당 상품은 매진되었습니다.");
            }

        } catch (OverTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해 주세요.");
        }
    }
}

    // 구매 가능 시간 에러
    class OverTimeException extends Exception {
        public OverTimeException(String exceptionMessage) {
            super(exceptionMessage);
        }
    }

    // 매진 에러
    class SoldOutException extends Exception {
        public SoldOutException(String exceptionMessage) {
            super(exceptionMessage);
        }
    }

