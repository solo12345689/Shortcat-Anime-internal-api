.class final Lv/d$g;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/d;->d(LC/i;ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/i;

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Landroidx/compose/animation/h;

.field final synthetic e:Landroidx/compose/animation/j;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lie/o;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(LC/i;ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/d$g;->a:LC/i;

    .line 2
    .line 3
    iput-boolean p2, p0, Lv/d$g;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, Lv/d$g;->c:Landroidx/compose/ui/e;

    .line 6
    .line 7
    iput-object p4, p0, Lv/d$g;->d:Landroidx/compose/animation/h;

    .line 8
    .line 9
    iput-object p5, p0, Lv/d$g;->e:Landroidx/compose/animation/j;

    .line 10
    .line 11
    iput-object p6, p0, Lv/d$g;->f:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Lv/d$g;->g:Lie/o;

    .line 14
    .line 15
    iput p8, p0, Lv/d$g;->h:I

    .line 16
    .line 17
    iput p9, p0, Lv/d$g;->i:I

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
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

    invoke-virtual {p0, p1, p2}, Lv/d$g;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 10

    .line 2
    iget-object v0, p0, Lv/d$g;->a:LC/i;

    iget-boolean v1, p0, Lv/d$g;->b:Z

    iget-object v2, p0, Lv/d$g;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lv/d$g;->d:Landroidx/compose/animation/h;

    iget-object v4, p0, Lv/d$g;->e:Landroidx/compose/animation/j;

    iget-object v5, p0, Lv/d$g;->f:Ljava/lang/String;

    iget-object v6, p0, Lv/d$g;->g:Lie/o;

    iget p2, p0, Lv/d$g;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v8

    iget v9, p0, Lv/d$g;->i:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Lv/d;->d(LC/i;ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V

    return-void
.end method
