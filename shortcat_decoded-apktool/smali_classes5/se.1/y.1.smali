.class Lse/y;
.super Ljava/lang/Object;

# interfaces
.implements Lie/a;


# instance fields
.field private final a:Lye/b;

.field private final b:I


# direct methods
.method public constructor <init>(Lye/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lse/y;->a:Lye/b;

    .line 5
    .line 6
    iput p2, p0, Lse/y;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lse/y;->a:Lye/b;

    .line 2
    .line 3
    iget v1, p0, Lse/y;->b:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lse/A;->M(Lye/b;I)Lye/W;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
