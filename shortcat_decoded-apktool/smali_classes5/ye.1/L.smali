.class Lye/L;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final a:Lye/M;


# direct methods
.method public constructor <init>(Lye/M;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lye/L;->a:Lye/M;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lye/L;->a:Lye/M;

    .line 2
    .line 3
    check-cast p1, Lye/M$a;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lye/M;->b(Lye/M;Lye/M$a;)Lye/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
