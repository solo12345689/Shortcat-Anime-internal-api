.class public abstract Lk0/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/D;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk0/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lk0/i;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LY/H;->j(Lie/a;)LY/b1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lk0/j;->a:LY/D;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a()Lk0/f;
    .locals 1

    .line 1
    invoke-static {}, Lk0/j;->b()Lk0/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final b()Lk0/f;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public static final c()LY/D;
    .locals 1

    .line 1
    sget-object v0, Lk0/j;->a:LY/D;

    .line 2
    .line 3
    return-object v0
.end method
