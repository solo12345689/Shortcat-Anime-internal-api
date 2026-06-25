.class public final synthetic LY/e1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:LY/f1;

.field public final synthetic b:I

.field public final synthetic c:Lt/K;


# direct methods
.method public synthetic constructor <init>(LY/f1;ILt/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/e1;->a:LY/f1;

    .line 5
    .line 6
    iput p2, p0, LY/e1;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LY/e1;->c:Lt/K;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LY/e1;->a:LY/f1;

    .line 2
    .line 3
    iget v1, p0, LY/e1;->b:I

    .line 4
    .line 5
    iget-object v2, p0, LY/e1;->c:Lt/K;

    .line 6
    .line 7
    check-cast p1, LY/x;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, LY/f1;->b(LY/f1;ILt/K;LY/x;)LTd/L;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
