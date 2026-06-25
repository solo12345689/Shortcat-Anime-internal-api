.class final LAd/e$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAd/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroid/graphics/Bitmap;

.field final synthetic c:LAd/e;

.field final synthetic d:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/graphics/Bitmap;LAd/e;Landroid/widget/ImageView;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LAd/e$b$a;->b:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    iput-object p2, p0, LAd/e$b$a;->c:LAd/e;

    .line 4
    .line 5
    iput-object p3, p0, LAd/e$b$a;->d:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance p1, LAd/e$b$a;

    .line 2
    .line 3
    iget-object v0, p0, LAd/e$b$a;->b:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iget-object v1, p0, LAd/e$b$a;->c:LAd/e;

    .line 6
    .line 7
    iget-object v2, p0, LAd/e$b$a;->d:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, LAd/e$b$a;-><init>(Landroid/graphics/Bitmap;LAd/e;Landroid/widget/ImageView;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LAd/e$b$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LAd/e$b$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LAd/e$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LAd/e$b$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LAd/e$b$a;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LAd/e$b$a;->b:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LAd/e$b$a;->d:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p0, LAd/e$b$a;->c:LAd/e;

    .line 22
    .line 23
    invoke-static {p1}, LAd/e;->a(LAd/e;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method
