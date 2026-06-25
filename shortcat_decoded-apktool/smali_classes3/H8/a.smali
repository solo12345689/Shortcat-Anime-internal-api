.class public abstract LH8/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LP8/a;

.field public static final b:LP8/a;

.field public static final c:LI8/a;

.field public static final d:LJ8/a;

.field public static final e:LP8/a$g;

.field public static final f:LP8/a$g;

.field private static final g:LP8/a$a;

.field private static final h:LP8/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LP8/a$g;

    .line 2
    .line 3
    invoke-direct {v0}, LP8/a$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH8/a;->e:LP8/a$g;

    .line 7
    .line 8
    new-instance v1, LP8/a$g;

    .line 9
    .line 10
    invoke-direct {v1}, LP8/a$g;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LH8/a;->f:LP8/a$g;

    .line 14
    .line 15
    new-instance v2, LH8/d;

    .line 16
    .line 17
    invoke-direct {v2}, LP8/a$a;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v2, LH8/a;->g:LP8/a$a;

    .line 21
    .line 22
    new-instance v3, LH8/e;

    .line 23
    .line 24
    invoke-direct {v3}, LP8/a$a;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v3, LH8/a;->h:LP8/a$a;

    .line 28
    .line 29
    sget-object v4, LH8/b;->a:LP8/a;

    .line 30
    .line 31
    sput-object v4, LH8/a;->a:LP8/a;

    .line 32
    .line 33
    new-instance v4, LP8/a;

    .line 34
    .line 35
    const-string v5, "Auth.CREDENTIALS_API"

    .line 36
    .line 37
    invoke-direct {v4, v5, v2, v0}, LP8/a;-><init>(Ljava/lang/String;LP8/a$a;LP8/a$g;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, LP8/a;

    .line 41
    .line 42
    const-string v2, "Auth.GOOGLE_SIGN_IN_API"

    .line 43
    .line 44
    invoke-direct {v0, v2, v3, v1}, LP8/a;-><init>(Ljava/lang/String;LP8/a$a;LP8/a$g;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LH8/a;->b:LP8/a;

    .line 48
    .line 49
    sget-object v0, LH8/b;->b:LI8/a;

    .line 50
    .line 51
    sput-object v0, LH8/a;->c:LI8/a;

    .line 52
    .line 53
    new-instance v0, LK8/h;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    sput-object v0, LH8/a;->d:LJ8/a;

    .line 59
    .line 60
    return-void
.end method
