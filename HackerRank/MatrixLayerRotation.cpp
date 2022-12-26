#include<bits/stdc++.h>
using namespace std;

int main() {
	int M, N, R;
	cin>>M>>N>>R;
	int **matrix = new int*[M];
	for(int i = 0; i < M; i++) {
		matrix[i] = new int[N];
		for(int j = 0; j < N; j++) {
			cin>>matrix[i][j];
		}
	}

	int numRings = min(M,N)/2;
	for(int i = 0; i < numRings; i++) {
		int numRotations = R%(2*(M + N - 4*i) - 4);
		for(int rotation = 0; rotation < numRotations; rotation++) {
			for(int j = i; j < N-i-1; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[i][j+1];
				matrix[i][j+1] = tmp;
			}
			for(int j = i; j < M-i-1; j++) {
				int tmp = matrix[j][N-i-1];
				matrix[j][N-i-1] = matrix[j+1][N-i-1];
				matrix[j+1][N-i-1] = tmp;
			}

			for(int j = N-i-1; j > i; j--) {
				int tmp = matrix[M-i-1][j];
				matrix[M-i-1][j] = matrix[M-i-1][j-1];
				matrix[M-i-1][j-1] = tmp;
			}
	
			for(int j = M-i-1; j > i+1; j--) {
				int tmp = matrix[j][i];
				matrix[j][i] = matrix[j-1][i];
				matrix[j-1][i] = tmp;
			}
		}
	}

	for(int i = 0; i < M; i++) {
		for(int j = 0; j < N; j++) {
			cout<<matrix[i][j]<<" ";
		}
		cout<<"\n";
	}
    return 0;
}
