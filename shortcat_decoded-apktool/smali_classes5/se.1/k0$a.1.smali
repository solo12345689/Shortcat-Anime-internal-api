.class public final Lse/k0$a;
.super Lse/K0$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lpe/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final j:Lse/k0;


# direct methods
.method public constructor <init>(Lse/k0;)V
    .locals 1

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lse/K0$d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lse/k0$a;->j:Lse/k0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic c0()Lse/K0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/k0$a;->i0()Lse/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public i0()Lse/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/k0$a;->j:Lse/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lse/k0$a;->j0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic j()Lpe/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/k0$a;->i0()Lse/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public j0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/k0$a;->i0()Lse/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lse/k0;->u0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
