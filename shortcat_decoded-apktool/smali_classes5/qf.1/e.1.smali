.class Lqf/e;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final a:Ljava/util/Collection;

.field private final b:Lqf/u0;

.field private final c:Luf/r;

.field private final d:Luf/j;


# direct methods
.method public constructor <init>(Ljava/util/Collection;Lqf/u0;Luf/r;Luf/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqf/e;->a:Ljava/util/Collection;

    .line 5
    .line 6
    iput-object p2, p0, Lqf/e;->b:Lqf/u0;

    .line 7
    .line 8
    iput-object p3, p0, Lqf/e;->c:Luf/r;

    .line 9
    .line 10
    iput-object p4, p0, Lqf/e;->d:Luf/j;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lqf/e;->a:Ljava/util/Collection;

    .line 2
    .line 3
    iget-object v1, p0, Lqf/e;->b:Lqf/u0;

    .line 4
    .line 5
    iget-object v2, p0, Lqf/e;->c:Luf/r;

    .line 6
    .line 7
    iget-object v3, p0, Lqf/e;->d:Luf/j;

    .line 8
    .line 9
    check-cast p1, Lqf/u0$a;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, Lqf/g;->a(Ljava/util/Collection;Lqf/u0;Luf/r;Luf/j;Lqf/u0$a;)LTd/L;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
