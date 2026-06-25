.class public LSg/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/KeySpec;


# instance fields
.field private final a:LSg/a;

.field private final b:[B


# direct methods
.method public constructor <init>(LSg/a;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LSg/c;->a:LSg/a;

    .line 5
    .line 6
    invoke-static {p2}, LOh/a;->f([B)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LSg/c;->b:[B

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()LSg/a;
    .locals 1

    .line 1
    iget-object v0, p0, LSg/c;->a:LSg/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()[B
    .locals 1

    .line 1
    iget-object v0, p0, LSg/c;->b:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
