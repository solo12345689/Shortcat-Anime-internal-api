.class Ldf/h;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final a:Lve/l;


# direct methods
.method public constructor <init>(Lve/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldf/h;->a:Lve/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/h;->a:Lve/l;

    .line 2
    .line 3
    check-cast p1, Lye/H;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ldf/i;->a(Lve/l;Lye/H;)Lqf/S;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
