.class final Landroidx/compose/ui/window/a$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a;->a(Lie/a;Landroidx/compose/ui/window/k;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lie/a;

.field final synthetic b:Landroidx/compose/ui/window/k;

.field final synthetic c:Lkotlin/jvm/functions/Function2;

.field final synthetic d:I

.field final synthetic e:I


# direct methods
.method constructor <init>(Lie/a;Landroidx/compose/ui/window/k;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/a$d;->a:Lie/a;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/window/a$d;->b:Landroidx/compose/ui/window/k;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/window/a$d;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/ui/window/a$d;->d:I

    .line 8
    .line 9
    iput p5, p0, Landroidx/compose/ui/window/a$d;->e:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/a$d;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 6

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/window/a$d;->a:Lie/a;

    iget-object v1, p0, Landroidx/compose/ui/window/a$d;->b:Landroidx/compose/ui/window/k;

    iget-object v2, p0, Landroidx/compose/ui/window/a$d;->c:Lkotlin/jvm/functions/Function2;

    iget p2, p0, Landroidx/compose/ui/window/a$d;->d:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v4

    iget v5, p0, Landroidx/compose/ui/window/a$d;->e:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/window/a;->a(Lie/a;Landroidx/compose/ui/window/k;Lkotlin/jvm/functions/Function2;LY/m;II)V

    return-void
.end method
