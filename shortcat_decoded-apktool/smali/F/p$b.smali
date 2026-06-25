.class final LF/p$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/p;->a(LF/q;Ljava/lang/Object;ILjava/lang/Object;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/q;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:I


# direct methods
.method constructor <init>(LF/q;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/p$b;->a:LF/q;

    .line 2
    .line 3
    iput-object p2, p0, LF/p$b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput p3, p0, LF/p$b;->c:I

    .line 6
    .line 7
    iput-object p4, p0, LF/p$b;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput p5, p0, LF/p$b;->e:I

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

    invoke-virtual {p0, p1, p2}, LF/p$b;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 6

    .line 2
    iget-object v0, p0, LF/p$b;->a:LF/q;

    iget-object v1, p0, LF/p$b;->b:Ljava/lang/Object;

    iget v2, p0, LF/p$b;->c:I

    iget-object v3, p0, LF/p$b;->d:Ljava/lang/Object;

    iget p2, p0, LF/p$b;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LF/p;->b(LF/q;Ljava/lang/Object;ILjava/lang/Object;LY/m;I)V

    return-void
.end method
