.class public final LJ0/a;
.super LJ0/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:LJ0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LJ0/j;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LJ0/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LJ0/a;->a:LJ0/j;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a(LJ0/c;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LJ0/a;->a:LJ0/j;

    .line 2
    .line 3
    invoke-interface {v0}, LJ0/j;->getKey()LJ0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public b(LJ0/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LJ0/a;->a:LJ0/j;

    .line 2
    .line 3
    invoke-interface {v0}, LJ0/j;->getKey()LJ0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    const-string p1, "Check failed."

    .line 15
    .line 16
    invoke-static {p1}, LH0/a;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object p1, p0, LJ0/a;->a:LJ0/j;

    .line 20
    .line 21
    invoke-interface {p1}, LJ0/j;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public final c(LJ0/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ0/a;->a:LJ0/j;

    .line 2
    .line 3
    return-void
.end method
