.class final LU/P$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/P;->b(ILkotlin/jvm/functions/Function2;Lie/o;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LC/P;Lkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkotlin/jvm/functions/Function2;

.field final synthetic c:Lie/o;

.field final synthetic d:Lkotlin/jvm/functions/Function2;

.field final synthetic e:Lkotlin/jvm/functions/Function2;

.field final synthetic f:LC/P;

.field final synthetic g:Lkotlin/jvm/functions/Function2;

.field final synthetic h:I


# direct methods
.method constructor <init>(ILkotlin/jvm/functions/Function2;Lie/o;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LC/P;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    iput p1, p0, LU/P$e;->a:I

    .line 2
    .line 3
    iput-object p2, p0, LU/P$e;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput-object p3, p0, LU/P$e;->c:Lie/o;

    .line 6
    .line 7
    iput-object p4, p0, LU/P$e;->d:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    iput-object p5, p0, LU/P$e;->e:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    iput-object p6, p0, LU/P$e;->f:LC/P;

    .line 12
    .line 13
    iput-object p7, p0, LU/P$e;->g:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    iput p8, p0, LU/P$e;->h:I

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

    invoke-virtual {p0, p1, p2}, LU/P$e;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 9

    .line 2
    iget v0, p0, LU/P$e;->a:I

    iget-object v1, p0, LU/P$e;->b:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, LU/P$e;->c:Lie/o;

    iget-object v3, p0, LU/P$e;->d:Lkotlin/jvm/functions/Function2;

    iget-object v4, p0, LU/P$e;->e:Lkotlin/jvm/functions/Function2;

    iget-object v5, p0, LU/P$e;->f:LC/P;

    iget-object v6, p0, LU/P$e;->g:Lkotlin/jvm/functions/Function2;

    iget p2, p0, LU/P$e;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v8

    move-object v7, p1

    invoke-static/range {v0 .. v8}, LU/P;->c(ILkotlin/jvm/functions/Function2;Lie/o;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LC/P;Lkotlin/jvm/functions/Function2;LY/m;I)V

    return-void
.end method
