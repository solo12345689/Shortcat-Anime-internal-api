.class final LU/b0$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/b0;->a(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU0/Y0;JJLY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/functions/Function2;

.field final synthetic b:Lkotlin/jvm/functions/Function2;

.field final synthetic c:Lkotlin/jvm/functions/Function2;

.field final synthetic d:LU0/Y0;

.field final synthetic e:J

.field final synthetic f:J

.field final synthetic g:I


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU0/Y0;JJI)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/b0$a;->a:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    iput-object p2, p0, LU/b0$a;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iput-object p3, p0, LU/b0$a;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iput-object p4, p0, LU/b0$a;->d:LU0/Y0;

    .line 8
    .line 9
    iput-wide p5, p0, LU/b0$a;->e:J

    .line 10
    .line 11
    iput-wide p7, p0, LU/b0$a;->f:J

    .line 12
    .line 13
    iput p9, p0, LU/b0$a;->g:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 17
    .line 18
    .line 19
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

    invoke-virtual {p0, p1, p2}, LU/b0$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 10

    .line 2
    iget-object v0, p0, LU/b0$a;->a:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, LU/b0$a;->b:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, LU/b0$a;->c:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, LU/b0$a;->d:LU0/Y0;

    iget-wide v4, p0, LU/b0$a;->e:J

    iget-wide v6, p0, LU/b0$a;->f:J

    iget p2, p0, LU/b0$a;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v9

    move-object v8, p1

    invoke-static/range {v0 .. v9}, LU/b0;->e(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU0/Y0;JJLY/m;I)V

    return-void
.end method
