.class public abstract LH8/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LP8/a;

.field public static final b:LI8/a;

.field public static final c:LP8/a$g;

.field private static final d:LP8/a$a;


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
    sput-object v0, LH8/b;->c:LP8/a$g;

    .line 7
    .line 8
    new-instance v1, LH8/h;

    .line 9
    .line 10
    invoke-direct {v1}, LH8/h;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LH8/b;->d:LP8/a$a;

    .line 14
    .line 15
    new-instance v2, LP8/a;

    .line 16
    .line 17
    const-string v3, "Auth.PROXY_API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, LP8/a;-><init>(Ljava/lang/String;LP8/a$a;LP8/a$g;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, LH8/b;->a:LP8/a;

    .line 23
    .line 24
    new-instance v0, Lcom/google/android/gms/internal/auth/f;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/f;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, LH8/b;->b:LI8/a;

    .line 30
    .line 31
    return-void
.end method
