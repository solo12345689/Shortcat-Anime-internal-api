.class public abstract LR8/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR8/o$a;
    }
.end annotation


# static fields
.field private static final a:LR8/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR8/K;

    .line 2
    .line 3
    invoke-direct {v0}, LR8/K;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR8/o;->a:LR8/N;

    .line 7
    .line 8
    return-void
.end method

.method public static a(LP8/h;LR8/o$a;)Ln9/i;
    .locals 3

    .line 1
    sget-object v0, LR8/o;->a:LR8/N;

    .line 2
    .line 3
    new-instance v1, Ln9/j;

    .line 4
    .line 5
    invoke-direct {v1}, Ln9/j;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, LR8/L;

    .line 9
    .line 10
    invoke-direct {v2, p0, v1, p1, v0}, LR8/L;-><init>(LP8/h;Ln9/j;LR8/o$a;LR8/N;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2}, LP8/h;->addStatusListener(LP8/h$a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ln9/j;->a()Ln9/i;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static b(LP8/h;)Ln9/i;
    .locals 1

    .line 1
    new-instance v0, LR8/M;

    .line 2
    .line 3
    invoke-direct {v0}, LR8/M;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, LR8/o;->a(LP8/h;LR8/o$a;)Ln9/i;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
