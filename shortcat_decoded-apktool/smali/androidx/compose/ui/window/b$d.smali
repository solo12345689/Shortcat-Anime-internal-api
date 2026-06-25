.class final Landroidx/compose/ui/window/b$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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

.field final synthetic b:Landroidx/compose/ui/window/s;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/m;Landroidx/compose/ui/window/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/b$d;->a:Landroidx/compose/ui/window/m;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/b$d;->b:Landroidx/compose/ui/window/s;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(LY/Y;)LY/X;
    .locals 1

    .line 2
    iget-object p1, p0, Landroidx/compose/ui/window/b$d;->a:Landroidx/compose/ui/window/m;

    iget-object v0, p0, Landroidx/compose/ui/window/b$d;->b:Landroidx/compose/ui/window/s;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/window/m;->setPositionProvider(Landroidx/compose/ui/window/s;)V

    .line 3
    iget-object p1, p0, Landroidx/compose/ui/window/b$d;->a:Landroidx/compose/ui/window/m;

    invoke-virtual {p1}, Landroidx/compose/ui/window/m;->s()V

    .line 4
    new-instance p1, Landroidx/compose/ui/window/b$d$a;

    invoke-direct {p1}, Landroidx/compose/ui/window/b$d$a;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$d;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
