.class final Lv/k$d$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/k$d;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/h2;


# direct methods
.method constructor <init>(LY/h2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/k$d$a;->a:LY/h2;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/g;

    invoke-virtual {p0, p1}, Lv/k$d$a;->invoke(Landroidx/compose/ui/graphics/g;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/g;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lv/k$d$a;->a:LY/h2;

    invoke-static {v0}, Lv/k$d;->a(LY/h2;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->e(F)V

    return-void
.end method
