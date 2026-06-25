.class public final synthetic Lka/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lka/v;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:LX1/f$a;


# direct methods
.method public synthetic constructor <init>(Lka/v;Ljava/lang/String;Ljava/lang/String;LX1/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lka/s;->a:Lka/v;

    .line 5
    .line 6
    iput-object p2, p0, Lka/s;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lka/s;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lka/s;->d:LX1/f$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lka/s;->a:Lka/v;

    .line 2
    .line 3
    iget-object v1, p0, Lka/s;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lka/s;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lka/s;->d:LX1/f$a;

    .line 8
    .line 9
    check-cast p1, LX1/c;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, Lka/v;->b(Lka/v;Ljava/lang/String;Ljava/lang/String;LX1/f$a;LX1/c;)LTd/L;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
