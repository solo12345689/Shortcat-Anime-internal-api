.class public abstract Llh/e;
.super LKg/a;


# instance fields
.field private final b:Llh/f;

.field private final c:I


# direct methods
.method public constructor <init>(ZLlh/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LKg/a;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Llh/e;->b:Llh/f;

    .line 5
    .line 6
    invoke-virtual {p2}, Llh/f;->d()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Llh/e;->c:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public b()Llh/f;
    .locals 1

    .line 1
    iget-object v0, p0, Llh/e;->b:Llh/f;

    .line 2
    .line 3
    return-object v0
.end method
