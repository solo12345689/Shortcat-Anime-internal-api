.class public final Lqf/s;
.super Lqf/p0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lze/h;


# direct methods
.method public constructor <init>(Lze/h;)V
    .locals 1

    .line 1
    const-string v0, "annotations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqf/p0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lqf/s;->a:Lze/h;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lqf/p0;)Lqf/p0;
    .locals 0

    .line 1
    check-cast p1, Lqf/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lqf/s;->d(Lqf/s;)Lqf/s;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b()Lpe/d;
    .locals 1

    .line 1
    const-class v0, Lqf/s;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic c(Lqf/p0;)Lqf/p0;
    .locals 0

    .line 1
    check-cast p1, Lqf/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lqf/s;->f(Lqf/s;)Lqf/s;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(Lqf/s;)Lqf/s;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, Lqf/s;

    .line 5
    .line 6
    iget-object v1, p0, Lqf/s;->a:Lze/h;

    .line 7
    .line 8
    iget-object p1, p1, Lqf/s;->a:Lze/h;

    .line 9
    .line 10
    invoke-static {v1, p1}, Lze/j;->a(Lze/h;Lze/h;)Lze/h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Lqf/s;-><init>(Lze/h;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final e()Lze/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/s;->a:Lze/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lqf/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lqf/s;

    .line 8
    .line 9
    iget-object p1, p1, Lqf/s;->a:Lze/h;

    .line 10
    .line 11
    iget-object v0, p0, Lqf/s;->a:Lze/h;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public f(Lqf/s;)Lqf/s;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/s;->a:Lze/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
