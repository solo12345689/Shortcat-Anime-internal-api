.class public abstract Lqf/z;
.super Lqf/E0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final c:Lqf/E0;


# direct methods
.method public constructor <init>(Lqf/E0;)V
    .locals 1

    .line 1
    const-string v0, "substitution"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqf/E0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lqf/z;->c:Lqf/E0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/z;->c:Lqf/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/E0;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d(Lze/h;)Lze/h;
    .locals 1

    .line 1
    const-string v0, "annotations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqf/z;->c:Lqf/E0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lqf/E0;->d(Lze/h;)Lze/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public e(Lqf/S;)Lqf/B0;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqf/z;->c:Lqf/E0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lqf/E0;->e(Lqf/S;)Lqf/B0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/z;->c:Lqf/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqf/E0;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g(Lqf/S;Lqf/N0;)Lqf/S;
    .locals 1

    .line 1
    const-string v0, "topLevelType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "position"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqf/z;->c:Lqf/E0;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lqf/E0;->g(Lqf/S;Lqf/N0;)Lqf/S;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
