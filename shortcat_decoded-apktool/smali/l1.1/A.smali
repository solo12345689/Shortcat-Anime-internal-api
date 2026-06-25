.class public final Ll1/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ll1/n;


# instance fields
.field private final a:Lp1/f;

.field private final b:Lq1/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lp1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/A;->a:Lp1/f;

    .line 5
    .line 6
    new-instance p1, Lq1/b$d;

    .line 7
    .line 8
    invoke-direct {p1}, Lq1/b$d;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ll1/A;->b:Lq1/b$d;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public b(Ll1/C;Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object p2, p0, Ll1/A;->a:Lp1/f;

    .line 2
    .line 3
    iget-object v0, p0, Ll1/A;->b:Lq1/b$d;

    .line 4
    .line 5
    invoke-static {p2, p1, v0}, Lq1/b;->v(Lp1/f;Lq1/g;Lq1/b$d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, Ll1/A;

    .line 14
    .line 15
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.compose.RawConstraintSet"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ll1/A;

    .line 29
    .line 30
    iget-object v1, p0, Ll1/A;->a:Lp1/f;

    .line 31
    .line 32
    iget-object p1, p1, Ll1/A;->a:Lp1/f;

    .line 33
    .line 34
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    return v2

    .line 41
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/A;->a:Lp1/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp1/b;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
