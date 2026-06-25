.class LQe/c;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# static fields
.field public static final a:LQe/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQe/c;

    .line 2
    .line 3
    invoke-direct {v0}, LQe/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQe/c;->a:LQe/c;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LQe/g;

    .line 2
    .line 3
    check-cast p2, LQe/A;

    .line 4
    .line 5
    invoke-static {p1, p2}, LQe/d;->D(LQe/g;LQe/A;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
