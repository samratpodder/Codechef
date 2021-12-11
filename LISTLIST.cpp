#include <bits/stdc++.h>
#define int long long
#define ld long double
#define mod1 1000000007
#define mod2 998244353
#define maxn 100001
#define fast ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define pb push_back
#define eb emplace_back
#define mp make_pair
#define lb lower_bound
#define ub upper_bound
#define mne min_element
#define mxe max_element
#define ff first
#define ss second
#define vi vector<int>
#define vc vector<char>
#define vs vector<string>
#define vb vector<bool>
#define vvi vector<vi>
#define vvc vector<vc>
#define pii pair<int,int>
#define vpi vector<pii>
#define dpq priority_queue<int,greater<int>>
#define apq priority_queue<int,>
#define fg(t,x) cout<<"Case #"<<t<<": "<<x<<"\n"
#define prsn(x) cout<<fixed<<setprecision(x)
#define sz(s) (int)s.size()
#define all(c) c.begin(),c.end()
#define min3(a,b,c) min(a,min(b,c))
#define min4(a,b,c,d) min(a,min3(b,c,d))
#define max3(a,b,c) max(a,max(b,c))
#define max4(a,b,c,d) max(a,max3(b,c,d))
#define rep(i,x,n) for(int i=x;i<n;i++)
#define repk(i,x,n,k) for(int i=x;i<n;i+=k)
#define rrep(i,n,x) for(int i=n-1;i>=x;i--)
#define mrep(x,m) for(auto x:m)

#ifdef programmer765
#define dbg(x) cerr<<#x<<" "; _print(x);cerr << "\n"
#else
#define dbg(x)
#endif

using namespace std;

void _print(int t) {cerr << t;}
void _print(double t) {cerr << t;}
void _print(char t) {cerr << t;}
void _print(string t) {cerr << t;}
void _print(ld t) {cerr << t;}
template<class T, class V> void _print(pair <T, V> p) {cerr << "{"; _print(p.ff); cerr << ","; _print(p.ss); cerr << "}";}
template<class T> void _print(vector<T> v) {cerr << "["; for (T x : v) {_print(x); cerr << " ";} cerr << "]";}
template<class T> void _print(set<T> s) {cerr << "["; for (T x : s) {_print(x); cerr << " ";} cerr << "]";}
template<class T> void _print(set<T, greater<T>> s) {cerr << "["; for (T x : s) {_print(x); cerr << " ";} cerr << "]";}
template<class T, class V> void _print(map<T, V> mpp) {cerr << "["; for (auto x : mpp) {_print(x); cerr << " ";} cerr << "]";}
vi sieve(int n) { vb prime(n + 1, 1); vi v; prime[0] = prime[1] = 0; for (int i = 2; i <= n; i++) {if (prime[i]) {v.pb(i); for (int j = i * i; j <= n; j += i) prime[j] = false;}} return v;}
vi sieveroot(int n) { vb prime(n + 1, 1); vi v; prime[0] = prime[1] = 0; for (int i = 2; i * i <= n; i++) {if (prime[i]) {v.pb(i); for (int j = i * i; j <= n; j += i) prime[j] = false;}} return v;}
int binpow(int a, int b) {int res = 1; while (b > 0) {if (b & 1) res *= a; a *= a; b >>= 1;} return res;}
int nCr(int n, int r) {int res = 1; rep(i, 1, r + 1) {res *= n - r + i; res /= i;} return res;}
int fact(int n) {int res = 1; rep(i, 1, n + 1) res *= i; return res;}
bool isprime(int x) {for (int i = 2; i * i <= x; i++) {if (x % i == 0) return false;} return true;}
int pq(int p, int q, int mod) {int x = mod - 2; while (x) {if (x & 1) p = (p * q) % mod; q = (q * q) % mod; x >>= 1;} return p;}
vi factor(int n) {vi ans; ans.pb(1); for (int i = 2; i * i <= n; i++) {if (n % i == 0) {ans.pb(i); if (n / i != i) ans.pb(n / i);}} if (n > 1) ans.pb(n); return ans;}

int32_t main() {
	fast
#ifdef programmer765
	freopen("error.txt", "w", stderr);
#endif
	int t;
	cin >> t;
	while (t--) {
		int n, x;
		cin >> n;
		map<int, int>mpp;
		rep(i, 0, n) {
			cin >> x;
			mpp[x]++;
		}
		if (n < 3) {
			if (sz(mpp) == 1) cout << "0\n";
			else cout << "-1\n";
			continue;
		}
		int mx = 0;
		mrep(x, mpp) mx = max(mx, x.ss);
		dbg(mpp);
		dbg(mx);
		if (sz(mpp) == 1) cout << "0\n";
		else if (mx < 2) cout << "-1\n";
		else cout << n - mx + 1 << "\n";
	}
}