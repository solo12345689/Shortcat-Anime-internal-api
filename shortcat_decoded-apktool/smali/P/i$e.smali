.class final LP/i$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/i;->Y(LR0/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP/i;


# direct methods
.method constructor <init>(LP/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/i$e;->a:LP/i;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 1

    .line 2
    iget-object v0, p0, LP/i$e;->a:LP/i;

    invoke-static {v0}, LP/i;->E1(LP/i;)V

    .line 3
    iget-object v0, p0, LP/i$e;->a:LP/i;

    invoke-static {v0}, LP/i;->J1(LP/i;)V

    .line 4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP/i$e;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
