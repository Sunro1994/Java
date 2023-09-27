# [자료구조] 배열을 이용한 Heap 구현하기

작성일시: 2023년 9월 16일 오후 11:37
복습: No

# 힙이란?

## 개념

✅ **최솟값 또는 최댓값**을 **빠르게** 찾아내기 위해 **완전이진트리** 형태로 만들어진 자료구조

[https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbbNRYk%2FbtqV36qaJux%2Fcklbzws6M82XkJkJaqPA51%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbbNRYk%2FbtqV36qaJux%2Fcklbzws6M82XkJkJaqPA51%2Fimg.png)

## 용어

1. 부모 노드(parent node) : 자기 자신과 연결된 노드 중 자신보다 높은 노드를 의미(F의 부모는 B다)
2. 자식 노드(child node) : 자기 자신(노드)과 연결 된 노드 중 자신보다 낮은 노드를 의미(C의 나식노드 G,H)
3. 루트 노드(root node) : 뿌리 노드라고하며 루트 노드는 하나의 트리에선 하나밖에 존재하지 않고, 부모 노드가 없다. (루트 노드 : A)
4. 단말 노드(leaf node) : 리프 노드라고 불리며, 자식 노드가 없는 노드를 의미(단말 노드 : I J K L)
5. 내부 노드(internal node) : 단말 노드가 아닌 노드
6. 형제 노드(sibling node) : 부모가 같은 노드를 말한다. (DEF는 모두 부모노드가 B이므로 형제노드다.
7. 깊이(depth) : 특정 노드에 도달하기 위해 거쳐가야 하는 간선의 개수를 의미(F의 깊이 A→B→F 이므로 2가 된다.)
8. 레벨(level) : 특정 깊이에 있는 노드들의 집합, 구현하는 사람에 따라 0 또는 1부터 시작한다.(DEFGH)
9. 차수(degree) : 특정 노드가 하위노드와 연결된 개수(B의 차수 : 3{D,E,F})

# 이진트리란?

## 개념

✅자식노드를 최대 2개까지밖에 못갖는 것

[https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FtMysu%2FbtqV0DJgeJf%2FUfsVUDLaMWGFFt7tMpumkk%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FtMysu%2FbtqV0DJgeJf%2FUfsVUDLaMWGFFt7tMpumkk%2Fimg.png)

## 완전 이진트리

1. 마지막 레벨을 제외한 모든 노드가 채워져있어야함
2. 모든 노드들은 왼쪽부터 채워져있어야 함

## 포화 이진트리

1. 완전 이진트리의 조건을 포함한
2. 마지막 레벨을 제외한 모든 노드들은 두 개의 자식 노드를 갖는다.

[https://img1.daumcdn.net/thumb/R1920x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbfi34R%2FbtqV2WnM4Jj%2FMTkKbZMrJDecwvs3Wns8DK%2Fimg.png](https://img1.daumcdn.net/thumb/R1920x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbfi34R%2FbtqV2WnM4Jj%2FMTkKbZMrJDecwvs3Wns8DK%2Fimg.png)

# 우선순위와 정렬

## 예시

어떤 리스트에 값을 넣었다가 뺴낼려고 할 때, 우선순위가 높은 것부터 빼내려고 한다면 대개 정렬을 떠올리게 된다.

쉽게 생각해서 숫자가 낮을 수록 우선순위가 높다고 가정할 때 매 번 새 원소가 들어올 때마다 이미 리스트에 있던 원소들과 비교하고 정렬을 해야 한다.

❗이러한 비효율을 해결하기 위한 다음과 같은 조건

**부모 노드는 항상 자식 노드보다 우선순위가 높다.**

모든 요소들을 고려하여 우선순위를 정할 필요 없이 부모 노드는 자식보다 항상 우선순위가 높다는 조건만 만족시키며 완전이진트리 형태로 채워나가는 것이다.

루트 노드는 항상 우선순위가 높은 노드이다.

이러한 원리로 최댓값 혹은 최솟값을 빠르게 찾아낼 수 있다는 장점(시간복잡도  : O(1))과 함께 삽입 삭제 연산시에도 부모 노드가 자식노드보다 우선순위만 높으면 되므로 트리의 깊이만큼만 비교하면 되기 때문에 O(logN)의 시간복잡도를 갖고 매우 빠르게 수행 가능하다.

[https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcUJahp%2FbtqV36KtdQ4%2FLzdICgKMk7KvYULPjkKQy1%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcUJahp%2FbtqV36KtdQ4%2FLzdICgKMk7KvYULPjkKQy1%2Fimg.png)

✅부모노드와 자식 노드간의 관계만 신경쓰면 되기 때문에 형제 간 우선순위는 고려되지 않는다.

이러한 정렬 상태를 **`반 정렬 상태, 느슨한 정렬 상태, 약한 힙`**이라고도 부른다.

# 최소 힙과 최대 힙

✅최소 힙과 최대 힙

1. 최소 힙 : 부모 노드의 값 ≤ 자식 노드의 값
2. 최대 힙 : 부모 노드의 값 ≥ 자식 노드의 값

[https://img1.daumcdn.net/thumb/R1920x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbXeFO2%2FbtqVTGz4Spk%2FEmiJ4rN545GnSjLddKZnT0%2Fimg.png](https://img1.daumcdn.net/thumb/R1920x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbXeFO2%2FbtqVTGz4Spk%2FEmiJ4rN545GnSjLddKZnT0%2Fimg.png)

보통 오름차순을 많이하고 많은 언어들도 오름차순을 기본으로 하기 때문에 최소 힙을 구현해본다.

위의 트리 구조는 배열을 통해 구현한다.

물론 연결리스트로도 구현이 가능하지만 특정 노드의 검색, 이동 과정이 조금 더 번거롭다.

배열의 경우 특정 인덱스에 바로 접근할 수 있기 때문에 좀 더 효율적이다.

[https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FWDMjZ%2FbtqV8GEMhcb%2FM2Wm02OJQhSh7sdW1kSzLK%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FWDMjZ%2FbtqV8GEMhcb%2FM2Wm02OJQhSh7sdW1kSzLK%2Fimg.png)

## 특징

1. 구현의 용이함을 위해 시작 인덱스는 1부터 시작한다.
2. 각 노드와 대응되는 배열의 인덱스는 ‘불변한다’

위 특징을 기준으로 각 인덱스별로 채워넣으면 특이한 성질이 나오는데 이는 다음과 같다.

## 성질

1. 왼쪽 자식 노드 인덱스 = 부모 노드 인덱스 *2
2. 오른쪽 자식 노드 인덱스 = 부모 노드 인덱스 *2 +1
3. 부모 노드 인덱스 = 자식 노드 인덱스/2

## 코드 구현

✅ Heap.java(생성자~ resize)

모든 자료구조는 기본적으로 동적으로 만들 수 있어야 한다.

```jsx
public class Heap<E> {
	
	private final Comparator<? super E> comparator;
	private static final int DEFAULT_CAPACITY = 10; //최소 기본 크기 ,동적 관리를 위한 최소화
	
	private int size; //요소 개수
	
	private Object[] array; //요소를 담을 배열
	
	//생성자 Type1 (초기 공간 할당 x)
	public Heap() {
		this(null);
	}
	
	public Heap(Comparator<? super E> comparator) {
		this.array= new Object[DEFAULT_CAPACITY];
		this.size=0;
		this.comparator = comparator;
	}
	
	//생서자 Type2(초기 공간 할당o)
	public Heap(int capacity, Comparator<? super E> comparator) {
		this.array = new Object[capacity];
		this.size =0;
		this.comparator = comparator;
	}
	
	//받은 인덱스의 부모 노드 인덱스를 반환
	private int getParent(int index) {
		return index/2;
	}
	
	//받은 인덱스의 왼쪽 자식 노드 인덱스를 반환
	private int getLeftChild(int index) {
		return index *2;
	}
	
	//받은 인덱스의 오른쪽 자식 노드 인덱스를 반환
	private int getRightChild(int index) {
		return index *2 +1;
	}
	
	//resize 메서드 만들기
	private void resize(int newCapacity) {
		//새로 만들 배열
		Object[] newArray = new Object[newCapacity];
		
		//새 배열에 기존에 있던 배열의 요소들을 모두 복사해준다.
		for(int i=1; i<=size; i++) {
			newArray[i] = array[i];
		}
		
		/*
		 * 현재 배열은 GC처리를 위해 null로 처리한뒤
		 * 새 배열을 연결해준다.
		 */
		this.array = null;
		this.array = newArray;
		
		
		//힙의 삽입
	}
	
}
```

## add메서드 구현

Heap의 삽입의 방식

1. 사용자가 Comparator을 사용하여 정렬 방법을 Heap생성단계에서 넘겨받은 경우(comparator가 null이 아닌 경우)
2. 클래스 내에 정렬 방식을 Comparable로 구현했거나 기본 정렬 방식을 따르는 경우(comparator가 null인 경우)

✅배열의 마지막 부분에 원소를 넣고 부모 노드를 찾아가면서 부모 노드가 삽입 노드보다 작을 때까지 요소를 교환해가면서 올라간다. 이러한 과정을 상향선별(sift-up)이라고도 불린다.

[https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fci59jf%2FbtqWNbRsmLA%2FScwEtG3n9neieCEJBVeos0%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fci59jf%2FbtqWNbRsmLA%2FScwEtG3n9neieCEJBVeos0%2Fimg.png)

## 구현코드

```jsx
public void add(E value) {
		//배열 용적이 꽉 차있을 경우 용적을 두배로 늘려준다.
		if(size +1 == array.length) {
			resize(array.length*2);
		}
		
		siftUp(size+1 , value);
		size++;
	}
	
	//상향 선별
	/**
	 * 
	 * @param idx 추가할 노드의 인덱스
	 * @param target 재배치 할 노드
	 */
	
	private void siftUp(int idx, E target) {
		//comparator가 존재할 경우 comparator을 인자로 넘겨 준다.
		if(comparator != null) {
			siftUpComparator(idx, target, comparator);
		}
		else {
			siftUpComparable(idx,target);
		}
	}
	
	// Comparator을 이용한 sift-up
	@SuppressWarnings("unchecked")
	private void siftUpComparator(int idx, E target, Comparator<? super E> comp) {
		
		//root노드보다 클 때까지만 탐색한다.
		while(idx>1) {
			int parent = getParent(idx);
			Object parentVal = array[parent]; //부모 노드의 값
		//타겟 노드 값이 부모 노드보다 크면 반복문 종료
			if(comp.compare(target, (E) parentVal) >=0) {
				break;
			}
		/*
		 * 부모노드가 타겟노드보다 크므로
		 * 현재 삽입 될 위치에 부모노드 값으로 교체해주고
		 * 타겟 노드의 위치를 부모노드의 위치로 교체해준다.
		 */
			array[idx]= parentVal;
			idx = parent;
		}
		array[idx]= target;
	}
	
	//삽입 할 객체의 Comparable을 이용한 sift-up
	@SuppressWarnings("unchecked")
	private void siftUpComparable(int idx, E target) {
		//타겟노드가 비교될 수 있도록 한 변수를 만든다.
		Comparable<? super E> comp = (Comparable<? super E> ) target;
		
		while(idx >1) {
			int parent = getParent(idx);
			Object parentVal = array[parent];
			
			if(comp.compareTo((E)parentVal)>=0) {
				break;
			}
			array[idx] = parentVal;
			idx =parent;
		}
		array[idx] = comp;
	}
```

## remove 메서드 구현

add와 정반대로 구현한다.

root에 있는 노드를 삭제하고, 마지막에 위치한 노드를 root Node로 가져와 add와는 반대로 자식노드가 재배치하려는 노드보다 크거나 자식노드가 없을때까지 자신의 위치를 찾아가면 된다.

✅주의할 점은 왼쪽과 오른쪽 자식 노드 중 작은 값을 가진 노드랑 재배치할 노드와 비교해야 한다.

이렇게 아래로 내려가면서 재배치하는 과정을 sift-down(하향 선별)이라고도 한다.

[https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fb34svU%2FbtqWx5ZYjtI%2FKaMAkGXcQOh5Qe1HIKTpPk%2Fimg.png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fb34svU%2FbtqWx5ZYjtI%2FKaMAkGXcQOh5Qe1HIKTpPk%2Fimg.png)

## 코드 구현

```jsx
@SuppressWarnings("unchecked")
	public E remove() {
		if(array[1] == null) {		//만약 root가 비어있을경우 예외를 던지도록 함
			throw new NoSuchElementException();
		}
		
		E result = (E) array[1]; //삭제된 요소를 반환하기 위한 임시 변수
		E target; 	//타겟이 될 요소
		if(size ==1) {
			target= null;
		}
		else {
			target = (E) array[size];
		}
		array[size] = null; //타겟 노드를 비운다.
		
		//삭제할 노드의 인덱스와 이후 재배치 할 타겟 노드를 넘겨준다.
		siftDown(1, target);		//루트 노드가 삭제되므로 1을 넘겨준다.
		
		return result;
	}
	
	private void siftDown(int idx, E target) {
		//comparator가 존재할 경우 comparator을 인자로 넘겨준다.
		if(comparator != null) {
			siftDownComparator(idx, target, comparator);
		}
		else {
			siftDownComparable(idx, target);
		}
	}
	// Comparator을 이용한 sift-down
	@SuppressWarnings("unchecked")
	private void siftDownComparator(int idx, E target, Comparator<? super E> comp) {
			
		array[idx] = null;	// 삭제 할 인덱스의 노드를 삭제
		size--;	
				
		int parent = idx;	// 삭제노드부터 시작 할 부모를 가리키는 변수
		int child;	// 교환 될 자식을 가리키는 변수
			
		// 왼쪽 자식 노드의 인덱스가 요소의 개수보다 작을 때 까지 반복
		while((child = getLeftChild(parent)) <= size) {
				
			int right = getRightChild(parent);	// 오른쪽 자식 인덱스
				
			Object childVal = array[child];	// 왼쪽 자식의 값 (교환 될 값) 
				
			/*
			 *  오른쪽 자식 인덱스가 size를 넘지 않으면서
			 *  왼쪽 자식이 오른쪽 자식보다 큰 경우
			 *  재배치 할 노드는 작은 자식과 비교해야하므로 child와 childVal을
			 *  오른쪽 자식으로 바꿔준다. 
			 */
			if(right <= size && comp.compare((E) childVal, (E) array[right]) > 0) {
				child = right;
				childVal = array[child];
			}
				
			// 재배치 할 노드가 자식 노드보다 작을경우 반복문을 종료한다. 
			if(comp.compare(target ,(E) childVal) <= 0){
				break;
			}
				
			/*
			 *  현재 부모 인덱스에 자식 노드 값을 대체해주고 
			 *  부모 인덱스를 자식 인덱스로 교체
			 */
			array[parent] = childVal;
			parent = child;
		}
			
		// 최종적으로 재배치 되는 위치에 타겟이 된 값을 넣어준다.
		array[parent] = target;
			
		/*
		 *  용적의 사이즈가 최소 용적보다는 크면서 요소의 개수가 전체 용적의 1/4일경우 
		 *  용적을 반으로 줄임(단, 최소용적보단 커야함)
		 */
		if(array.length > DEFAULT_CAPACITY && size < array.length / 4) {
			resize(Math.max(DEFAULT_CAPACITY, array.length / 2));
		}
	 
	}
		
	// Comparable을 이용한 sift-down
	@SuppressWarnings("unchecked")
	private void siftDownComparable(int idx, E target) {
			
		Comparable<? super E> comp = (Comparable<? super E>) target;
			
		array[idx] = null;
		size--;
			
		int parent = idx;
		int child;
	 
		while((child = getLeftChild(parent)) <= size) {
				
			int right = getRightChild(parent);
				
			Object childVal = array[child];
			
			if(right <= size && ((Comparable<? super E>)childVal).compareTo((E)array[right]) > 0) {
				child = right;
				childVal = array[child];
			}
				
			if(comp.compareTo((E) childVal) <= 0){
				break;
			}
			array[parent] = childVal;
			parent = child;
				
		}
		array[parent] = comp;
			
		if(array.length > DEFAULT_CAPACITY && size < array.length / 4) {
			resize(Math.max(DEFAULT_CAPACITY, array.length / 2));
		}
			
	}
```

## size, peek, isEmpty, toArray

```jsx
public int size() {
	return this.size;
}
	
@SuppressWarnings("unchecked")
public E peek() {
	if(array[1] == null) {
		throw new NoSuchElementException();
	}	
	return (E)array[1];
}
 
public boolean isEmpty() {
	return size == 0;
}
 
public Object[] toArray() {
	return Arrays.copyOf(array, size + 1);
}
```