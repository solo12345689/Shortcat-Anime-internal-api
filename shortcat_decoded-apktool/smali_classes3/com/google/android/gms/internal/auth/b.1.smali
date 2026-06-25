.class final Lcom/google/android/gms/internal/auth/b;
.super LP8/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/auth/c1;


# static fields
.field private static final l:LP8/a$g;

.field private static final m:LP8/a$a;

.field private static final n:LP8/a;

.field private static final o:LU8/a;


# instance fields
.field private final k:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LP8/a$g;

    .line 2
    .line 3
    invoke-direct {v0}, LP8/a$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/auth/b;->l:LP8/a$g;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/auth/V1;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/auth/V1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/auth/b;->m:LP8/a$a;

    .line 14
    .line 15
    new-instance v2, LP8/a;

    .line 16
    .line 17
    const-string v3, "GoogleAuthService.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, LP8/a;-><init>(Ljava/lang/String;LP8/a$a;LP8/a$g;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/auth/b;->n:LP8/a;

    .line 23
    .line 24
    const-string v0, "GoogleAuthServiceClient"

    .line 25
    .line 26
    filled-new-array {v0}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, LG8/d;->a([Ljava/lang/String;)LU8/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lcom/google/android/gms/internal/auth/b;->o:LU8/a;

    .line 35
    .line 36
    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/b;->n:LP8/a;

    .line 2
    .line 3
    sget-object v1, LP8/a$d;->O:LP8/a$d$a;

    .line 4
    .line 5
    sget-object v2, LP8/e$a;->c:LP8/e$a;

    .line 6
    .line 7
    invoke-direct {p0, p1, v0, v1, v2}, LP8/e;-><init>(Landroid/content/Context;LP8/a;LP8/a$d;LP8/e$a;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/auth/b;->k:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method

.method static bridge synthetic y(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ln9/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LQ8/s;->b(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ln9/j;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lcom/google/android/gms/internal/auth/b;->o:LU8/a;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    new-array p1, p1, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string p2, "The task is already complete."

    .line 13
    .line 14
    invoke-virtual {p0, p2, p1}, LU8/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lcom/google/android/gms/internal/auth/g;)Ln9/i;
    .locals 2

    .line 1
    invoke-static {}, LQ8/r;->a()LQ8/r$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LG8/e;->l:LO8/c;

    .line 6
    .line 7
    filled-new-array {v1}, [LO8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, LQ8/r$a;->d([LO8/c;)LQ8/r$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/google/android/gms/internal/auth/U1;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth/U1;-><init>(Lcom/google/android/gms/internal/auth/b;Lcom/google/android/gms/internal/auth/g;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, LQ8/r$a;->b(LQ8/n;)LQ8/r$a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/16 v0, 0x5e9

    .line 25
    .line 26
    invoke-virtual {p1, v0}, LQ8/r$a;->e(I)LQ8/r$a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, LQ8/r$a;->a()LQ8/r;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, LP8/e;->m(LQ8/r;)Ln9/i;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final f(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Ln9/i;
    .locals 2

    .line 1
    const-string v0, "Account name cannot be null!"

    .line 2
    .line 3
    invoke-static {p1, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "Scope cannot be null!"

    .line 7
    .line 8
    invoke-static {p2, v0}, LR8/p;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-static {}, LQ8/r;->a()LQ8/r$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, LG8/e;->l:LO8/c;

    .line 16
    .line 17
    filled-new-array {v1}, [LO8/c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, LQ8/r$a;->d([LO8/c;)LQ8/r$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lcom/google/android/gms/internal/auth/T1;

    .line 26
    .line 27
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/T1;-><init>(Lcom/google/android/gms/internal/auth/b;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, LQ8/r$a;->b(LQ8/n;)LQ8/r$a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 p2, 0x5e8

    .line 35
    .line 36
    invoke-virtual {p1, p2}, LQ8/r$a;->e(I)LQ8/r$a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, LQ8/r$a;->a()LQ8/r;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, LP8/e;->m(LQ8/r;)Ln9/i;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
.end method
