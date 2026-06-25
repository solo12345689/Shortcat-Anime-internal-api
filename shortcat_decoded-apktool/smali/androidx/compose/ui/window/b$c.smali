.class final Landroidx/compose/ui/window/b$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


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

.field final synthetic b:Lie/a;

.field final synthetic c:Landroidx/compose/ui/window/t;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Li1/t;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/m;Lie/a;Landroidx/compose/ui/window/t;Ljava/lang/String;Li1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/b$c;->a:Landroidx/compose/ui/window/m;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/b$c;->b:Lie/a;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/window/b$c;->c:Landroidx/compose/ui/window/t;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/ui/window/b$c;->d:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/ui/window/b$c;->e:Li1/t;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/window/b$c;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/window/b$c;->a:Landroidx/compose/ui/window/m;

    .line 3
    iget-object v1, p0, Landroidx/compose/ui/window/b$c;->b:Lie/a;

    .line 4
    iget-object v2, p0, Landroidx/compose/ui/window/b$c;->c:Landroidx/compose/ui/window/t;

    .line 5
    iget-object v3, p0, Landroidx/compose/ui/window/b$c;->d:Ljava/lang/String;

    .line 6
    iget-object v4, p0, Landroidx/compose/ui/window/b$c;->e:Li1/t;

    .line 7
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/compose/ui/window/m;->o(Lie/a;Landroidx/compose/ui/window/t;Ljava/lang/String;Li1/t;)V

    return-void
.end method
