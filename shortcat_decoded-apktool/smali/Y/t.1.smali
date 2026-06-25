.class public final synthetic LY/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:LY/u1;

.field public final synthetic b:LY/H1;


# direct methods
.method public synthetic constructor <init>(LY/u1;LY/H1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/t;->a:LY/u1;

    .line 5
    .line 6
    iput-object p2, p0, LY/t;->b:LY/H1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LY/t;->a:LY/u1;

    .line 2
    .line 3
    iget-object v1, p0, LY/t;->b:LY/H1;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {v0, v1, p1, p2}, LY/w;->b(LY/u1;LY/H1;ILjava/lang/Object;)LTd/L;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
