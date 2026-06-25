.class LLe/C;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:LLe/D;


# direct methods
.method public constructor <init>(LLe/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LLe/C;->a:LLe/D;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/C;->a:LLe/D;

    .line 2
    .line 3
    invoke-static {v0}, LLe/D;->L0(LLe/D;)Ljava/util/HashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
