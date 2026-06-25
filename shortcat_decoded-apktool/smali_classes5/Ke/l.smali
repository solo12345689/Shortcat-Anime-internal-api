.class LKe/l;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final a:LKe/m;


# direct methods
.method public constructor <init>(LKe/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LKe/l;->a:LKe/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/l;->a:LKe/m;

    .line 2
    .line 3
    check-cast p1, LOe/y;

    .line 4
    .line 5
    invoke-static {v0, p1}, LKe/m;->b(LKe/m;LOe/y;)LLe/c0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
