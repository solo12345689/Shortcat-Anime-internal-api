.class final Landroidx/compose/ui/window/a$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a;->a(Lie/a;Landroidx/compose/ui/window/k;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/l;

.field final synthetic b:Lie/a;

.field final synthetic c:Landroidx/compose/ui/window/k;

.field final synthetic d:Li1/t;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/l;Lie/a;Landroidx/compose/ui/window/k;Li1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/a$c;->a:Landroidx/compose/ui/window/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/a$c;->b:Lie/a;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/window/a$c;->c:Landroidx/compose/ui/window/k;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/ui/window/a$c;->d:Li1/t;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/window/a$c;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/window/a$c;->a:Landroidx/compose/ui/window/l;

    .line 3
    iget-object v1, p0, Landroidx/compose/ui/window/a$c;->b:Lie/a;

    .line 4
    iget-object v2, p0, Landroidx/compose/ui/window/a$c;->c:Landroidx/compose/ui/window/k;

    .line 5
    iget-object v3, p0, Landroidx/compose/ui/window/a$c;->d:Li1/t;

    .line 6
    invoke-virtual {v0, v1, v2, v3}, Landroidx/compose/ui/window/l;->o(Lie/a;Landroidx/compose/ui/window/k;Li1/t;)V

    return-void
.end method
