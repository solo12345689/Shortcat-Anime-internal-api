.class final Landroidx/compose/foundation/o$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/o;-><init>(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/o;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/o$e;->a:Landroidx/compose/foundation/o;

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
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/o$e;->a:Landroidx/compose/foundation/o;

    invoke-virtual {v0}, Landroidx/compose/foundation/o;->m()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/o$e;->a:Landroidx/compose/foundation/o;

    invoke-virtual {v1}, Landroidx/compose/foundation/o;->l()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/compose/foundation/o$e;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
