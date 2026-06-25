.class public final LT8/d;
.super LP8/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LR8/v;


# static fields
.field private static final k:LP8/a$g;

.field private static final l:LP8/a$a;

.field private static final m:LP8/a;

.field public static final synthetic n:I


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
    sput-object v0, LT8/d;->k:LP8/a$g;

    .line 7
    .line 8
    new-instance v1, LT8/c;

    .line 9
    .line 10
    invoke-direct {v1}, LT8/c;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LT8/d;->l:LP8/a$a;

    .line 14
    .line 15
    new-instance v2, LP8/a;

    .line 16
    .line 17
    const-string v3, "ClientTelemetry.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, LP8/a;-><init>(Ljava/lang/String;LP8/a$a;LP8/a$g;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, LT8/d;->m:LP8/a;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LR8/w;)V
    .locals 2

    .line 1
    sget-object v0, LT8/d;->m:LP8/a;

    .line 2
    .line 3
    sget-object v1, LP8/e$a;->c:LP8/e$a;

    .line 4
    .line 5
    invoke-direct {p0, p1, v0, p2, v1}, LP8/e;-><init>(Landroid/content/Context;LP8/a;LP8/a$d;LP8/e$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LR8/t;)Ln9/i;
    .locals 2

    .line 1
    invoke-static {}, LQ8/r;->a()LQ8/r$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ld9/d;->a:LO8/c;

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
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, LQ8/r$a;->c(Z)LQ8/r$a;

    .line 16
    .line 17
    .line 18
    new-instance v1, LT8/b;

    .line 19
    .line 20
    invoke-direct {v1, p1}, LT8/b;-><init>(LR8/t;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, LQ8/r$a;->b(LQ8/n;)LQ8/r$a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, LQ8/r$a;->a()LQ8/r;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, LP8/e;->i(LQ8/r;)Ln9/i;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method
