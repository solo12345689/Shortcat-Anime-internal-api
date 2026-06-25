.class final Lcoil/compose/a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil/compose/a;->a(Ljava/lang/Object;Ljava/lang/String;Lv4/d;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;ILY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lv4/d;

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:Lkotlin/jvm/functions/Function1;

.field final synthetic f:Lkotlin/jvm/functions/Function1;

.field final synthetic g:Ll0/e;

.field final synthetic h:LI0/f;

.field final synthetic i:F

.field final synthetic j:Landroidx/compose/ui/graphics/d;

.field final synthetic k:I

.field final synthetic l:I

.field final synthetic m:I

.field final synthetic n:I


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lv4/d;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;IIII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/a$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil/compose/a$a;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil/compose/a$a;->c:Lv4/d;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil/compose/a$a;->d:Landroidx/compose/ui/e;

    .line 8
    .line 9
    iput-object p5, p0, Lcoil/compose/a$a;->e:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iput-object p6, p0, Lcoil/compose/a$a;->f:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iput-object p7, p0, Lcoil/compose/a$a;->g:Ll0/e;

    .line 14
    .line 15
    iput-object p8, p0, Lcoil/compose/a$a;->h:LI0/f;

    .line 16
    .line 17
    iput p9, p0, Lcoil/compose/a$a;->i:F

    .line 18
    .line 19
    iput-object p10, p0, Lcoil/compose/a$a;->j:Landroidx/compose/ui/graphics/d;

    .line 20
    .line 21
    iput p11, p0, Lcoil/compose/a$a;->k:I

    .line 22
    .line 23
    iput p12, p0, Lcoil/compose/a$a;->l:I

    .line 24
    .line 25
    iput p13, p0, Lcoil/compose/a$a;->m:I

    .line 26
    .line 27
    iput p14, p0, Lcoil/compose/a$a;->n:I

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 31
    .line 32
    .line 33
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

    invoke-virtual {p0, p1, p2}, Lcoil/compose/a$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 16

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Lcoil/compose/a$a;->a:Ljava/lang/Object;

    iget-object v2, v0, Lcoil/compose/a$a;->b:Ljava/lang/String;

    iget-object v3, v0, Lcoil/compose/a$a;->c:Lv4/d;

    iget-object v4, v0, Lcoil/compose/a$a;->d:Landroidx/compose/ui/e;

    iget-object v5, v0, Lcoil/compose/a$a;->e:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lcoil/compose/a$a;->f:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lcoil/compose/a$a;->g:Ll0/e;

    iget-object v8, v0, Lcoil/compose/a$a;->h:LI0/f;

    iget v9, v0, Lcoil/compose/a$a;->i:F

    iget-object v10, v0, Lcoil/compose/a$a;->j:Landroidx/compose/ui/graphics/d;

    iget v11, v0, Lcoil/compose/a$a;->k:I

    iget v12, v0, Lcoil/compose/a$a;->l:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, LY/g1;->a(I)I

    move-result v13

    iget v12, v0, Lcoil/compose/a$a;->m:I

    invoke-static {v12}, LY/g1;->a(I)I

    move-result v14

    iget v15, v0, Lcoil/compose/a$a;->n:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v15}, Lcoil/compose/a;->a(Ljava/lang/Object;Ljava/lang/String;Lv4/d;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;ILY/m;III)V

    return-void
.end method
