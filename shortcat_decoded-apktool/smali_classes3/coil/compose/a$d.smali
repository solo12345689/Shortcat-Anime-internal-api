.class final Lcoil/compose/a$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil/compose/a;->c(Landroidx/compose/ui/e;Lw0/b;Ljava/lang/String;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lw0/b;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ll0/e;

.field final synthetic e:LI0/f;

.field final synthetic f:F

.field final synthetic g:Landroidx/compose/ui/graphics/d;

.field final synthetic h:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lw0/b;Ljava/lang/String;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/a$d;->a:Landroidx/compose/ui/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil/compose/a$d;->b:Lw0/b;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil/compose/a$d;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil/compose/a$d;->d:Ll0/e;

    .line 8
    .line 9
    iput-object p5, p0, Lcoil/compose/a$d;->e:LI0/f;

    .line 10
    .line 11
    iput p6, p0, Lcoil/compose/a$d;->f:F

    .line 12
    .line 13
    iput-object p7, p0, Lcoil/compose/a$d;->g:Landroidx/compose/ui/graphics/d;

    .line 14
    .line 15
    iput p8, p0, Lcoil/compose/a$d;->h:I

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

    invoke-virtual {p0, p1, p2}, Lcoil/compose/a$d;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 9

    .line 2
    iget-object v0, p0, Lcoil/compose/a$d;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lcoil/compose/a$d;->b:Lw0/b;

    iget-object v2, p0, Lcoil/compose/a$d;->c:Ljava/lang/String;

    iget-object v3, p0, Lcoil/compose/a$d;->d:Ll0/e;

    iget-object v4, p0, Lcoil/compose/a$d;->e:LI0/f;

    iget v5, p0, Lcoil/compose/a$d;->f:F

    iget-object v6, p0, Lcoil/compose/a$d;->g:Landroidx/compose/ui/graphics/d;

    iget p2, p0, Lcoil/compose/a$d;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v8

    move-object v7, p1

    invoke-static/range {v0 .. v8}, Lcoil/compose/a;->c(Landroidx/compose/ui/e;Lw0/b;Ljava/lang/String;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;LY/m;I)V

    return-void
.end method
