.class final LCf/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LCf/i;
.implements LCf/c;


# static fields
.field public static final a:LCf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LCf/e;

    .line 2
    .line 3
    invoke-direct {v0}, LCf/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LCf/e;->a:LCf/e;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(I)LCf/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LCf/e;->c(I)LCf/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(I)LCf/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LCf/e;->d(I)LCf/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(I)LCf/e;
    .locals 0

    .line 1
    sget-object p1, LCf/e;->a:LCf/e;

    .line 2
    .line 3
    return-object p1
.end method

.method public d(I)LCf/e;
    .locals 0

    .line 1
    sget-object p1, LCf/e;->a:LCf/e;

    .line 2
    .line 3
    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, LUd/G;->a:LUd/G;

    .line 2
    .line 3
    return-object v0
.end method
