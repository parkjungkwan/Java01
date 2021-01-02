package array;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언과 초기화
        // 데이터타입[] 배열이름 = new 데이터타입[크기]
        
        // int 5개가 모여있는 int 배열 intArray를 선언해보자
        int[] intArray = new int[5];
        
        // index
        // index란 배열같이 특정 데이터타입을 여러개 모아둔 변수를 다룰 때
        // 각 공간의 번호를 뜻한다.
        // index는 항상
        // 0부터 크기-1 까지의 값을 가진다.
        // 만약 우리가 잘못된 인덱스를 넘겨주면
        // 에러난다.
        // 예시: index 음수거나 크기 이상일 경우!
        
        // 그럼 우리가 for문을 이용해서
        // 배열의 내용을 쭉 출력해보자
        for(int i = 0; i < intArray.length; i++) {
            //배열이름.length는
            //해당 배열의 크기를 return 해준다.
            
            //배열의 각 공간에 접근할 때에는
            //배열이름[인덱스] 로 접근 가능하다.
            
            //우리가 배열을 선언할때 크기나
            //배열의 각 공간을 접근할때 적는 인덱스는
            //변수가 들어갈 수도 있다.
            System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
            
        }
        
        // 잘못된 인덱스일땐 다음과 같은 에러가 발생한다.
        // ArrayIndexOutOfBoundsException = 인덱스가 가능한 범위를 벗어남
        // System.out.println("intArray[-1]: "+intArray[-1]);
        // System.out.println("intArray[100]: "+intArray[100]);
        
        // 배열의 경우
        // 기본형 데이터타입의 배열일땐
        // 모든 칸이 0으로 초기화가 된다.
        // 참조형 데이터타입의 배열일땐
        // 모든 칸이 null로 초기화가 된다.
        
        // 배열이름[인덱스]는 하나의 변수처럼 볼수 있기 때문에
        // 해당 공간에 값을 입력하거나 아니면 저장된 값을 불러올 수 있다.
        intArray[0] = 15;
        System.out.println("intArray[0]: "+intArray[0]);
    }
}

















