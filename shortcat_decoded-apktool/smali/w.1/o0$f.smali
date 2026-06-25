.class final Lw/o0$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/o0;->e(Ljava/lang/Object;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/o0;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lw/o0;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/o0$f;->a:Lw/o0;

    .line 2
    .line 3
    iput-object p2, p0, Lw/o0$f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput p3, p0, Lw/o0$f;->c:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
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

    invoke-virtual {p0, p1, p2}, Lw/o0$f;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 2

    .line 2
    iget-object p2, p0, Lw/o0$f;->a:Lw/o0;

    iget-object v0, p0, Lw/o0$f;->b:Ljava/lang/Object;

    iget v1, p0, Lw/o0$f;->c:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LY/g1;->a(I)I

    move-result v1

    invoke-virtual {p2, v0, p1, v1}, Lw/o0;->e(Ljava/lang/Object;LY/m;I)V

    return-void
.end method
