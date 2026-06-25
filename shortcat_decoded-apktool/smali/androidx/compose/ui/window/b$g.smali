.class final Landroidx/compose/ui/window/b$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/window/t;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/m;

.field final synthetic b:Li1/t;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/m;Li1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/b$g;->a:Landroidx/compose/ui/window/m;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/b$g;->b:Li1/t;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
    .locals 7

    .line 1
    iget-object p2, p0, Landroidx/compose/ui/window/b$g;->a:Landroidx/compose/ui/window/m;

    .line 2
    .line 3
    iget-object p3, p0, Landroidx/compose/ui/window/b$g;->b:Li1/t;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, Landroidx/compose/ui/window/m;->setParentLayoutDirection(Li1/t;)V

    .line 6
    .line 7
    .line 8
    sget-object v4, Landroidx/compose/ui/window/b$g$a;->a:Landroidx/compose/ui/window/b$g$a;

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p1

    .line 16
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method
