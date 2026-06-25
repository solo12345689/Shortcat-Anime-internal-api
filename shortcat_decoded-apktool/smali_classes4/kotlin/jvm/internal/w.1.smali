.class public abstract Lkotlin/jvm/internal/w;
.super Lkotlin/jvm/internal/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lpe/j;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/A;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected computeReflected()Lpe/c;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/O;->d(Lkotlin/jvm/internal/w;)Lpe/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic d()Lpe/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/w;->d()Lpe/n$a;

    move-result-object v0

    return-object v0
.end method

.method public d()Lpe/n$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/I;->j()Lpe/m;

    move-result-object v0

    check-cast v0, Lpe/j;

    invoke-interface {v0}, Lpe/n;->d()Lpe/n$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lpe/i$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/w;->g()Lpe/j$a;

    move-result-object v0

    return-object v0
.end method

.method public g()Lpe/j$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/I;->j()Lpe/m;

    move-result-object v0

    check-cast v0, Lpe/j;

    invoke-interface {v0}, Lpe/j;->g()Lpe/j$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, Lpe/n;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
