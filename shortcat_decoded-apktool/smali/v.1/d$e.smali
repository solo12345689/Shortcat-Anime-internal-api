.class final Lv/d$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/d;->e(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Landroidx/compose/animation/h;

.field final synthetic d:Landroidx/compose/animation/j;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lie/o;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;II)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lv/d$e;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, Lv/d$e;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-object p3, p0, Lv/d$e;->c:Landroidx/compose/animation/h;

    .line 6
    .line 7
    iput-object p4, p0, Lv/d$e;->d:Landroidx/compose/animation/j;

    .line 8
    .line 9
    iput-object p5, p0, Lv/d$e;->e:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lv/d$e;->f:Lie/o;

    .line 12
    .line 13
    iput p7, p0, Lv/d$e;->g:I

    .line 14
    .line 15
    iput p8, p0, Lv/d$e;->h:I

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 19
    .line 20
    .line 21
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

    invoke-virtual {p0, p1, p2}, Lv/d$e;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 9

    .line 2
    iget-boolean v0, p0, Lv/d$e;->a:Z

    iget-object v1, p0, Lv/d$e;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Lv/d$e;->c:Landroidx/compose/animation/h;

    iget-object v3, p0, Lv/d$e;->d:Landroidx/compose/animation/j;

    iget-object v4, p0, Lv/d$e;->e:Ljava/lang/String;

    iget-object v5, p0, Lv/d$e;->f:Lie/o;

    iget p2, p0, Lv/d$e;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v7

    iget v8, p0, Lv/d$e;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lv/d;->e(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V

    return-void
.end method
